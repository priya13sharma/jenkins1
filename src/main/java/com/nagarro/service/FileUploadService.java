package com.nagarro.service;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.Dao;
import com.nagarro.dto.Product;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class FileUploadService {
	List<Product> shirtList = new ArrayList<Product>();
	@Autowired
	private Dao dao;

	public List<Product> saveData() {
		System.out.println("get data");
		CSVParser csvParser = new CSVParserBuilder().withSeparator('|').build();

		File directory = new File("C:\\Users\\priyasharma03\\eclipse-workspace\\ProductSearchWebApplication\\Assigment Links");
		System.out.println(directory);
		File[] file = directory.listFiles();
		System.out.println(file);

		for (File f : file) {
			try {
				CSVReader csvReader = new CSVReaderBuilder(new FileReader(f.getAbsolutePath())).withCSVParser(csvParser)
						.withSkipLines(1).build();
				String[] data = null;
				while ((data = csvReader.readNext()) != null) {
					Product product = new Product();
					product.setSid(data[0]);
					product.setSname(data[1]);
					product.setColor(data[2]);
					product.setGender(data[3]);
					product.setSize(data[4]);
					product.setPrice(Double.parseDouble(data[5]));
					product.setRating(Double.parseDouble(data[6]));
					product.setAvailability(data[7]);
					shirtList.add(product);
					dao.begin();
					dao.getSession().save(product);
					dao.commit();
					dao.close();

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.print(shirtList);
		return shirtList;
	}

}

