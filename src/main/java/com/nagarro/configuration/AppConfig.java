package com.nagarro.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nagarro.dao.Dao;
import com.nagarro.dao.ProductDao;
import com.nagarro.dao.UserDao;
import com.nagarro.daoImp.DaoImp;
import com.nagarro.daoImp.ProductDaoImp;
import com.nagarro.daoImp.UserDaoImp;
import com.nagarro.service.FileUploadService;

import com.nagarro.service.OutputPreferenceService;
import com.nagarro.service.ProductComparatorService;
import com.nagarro.service.ProductSearchService;
import com.nagarro.service.UserService;
//priyasharma
@Configuration
@EnableScheduling
public class AppConfig {
	@Bean
	public Dao getDao() {
		return new DaoImp();
	}

	@Bean
	public UserDao getUserDao() {
		return new UserDaoImp();
	}

	@Bean
	public UserService getUserService() {
		return new UserService();
	}

	@Bean
	public ProductDao getProductDao() {
		return new ProductDaoImp();
	}

	@Bean
	public ProductSearchService getProductSearchService() {
		return new ProductSearchService();
	}

	@Bean
	public FileUploadService getFileUploadService() {
		return new FileUploadService();
	}

	@Bean
	public OutputPreferenceService getOutputPreferanceService() {
		return new OutputPreferenceService();
	}

	@Bean
	public ProductComparatorService getProductComparatorService() {
		return new ProductComparatorService();
	}

}
