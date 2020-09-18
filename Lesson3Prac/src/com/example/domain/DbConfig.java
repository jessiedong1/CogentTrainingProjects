package com.example.domain;

public class DbConfig {
	private static DbConfig instance = new DbConfig();
	private String dbuser;
	private String dbpassword;
	private String connectionString;
	//Cannot be inherited 
	private DbConfig() {
		
	}
	
	public String getDbuser() {
		return dbuser;
	}

	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}

	public String getDbpassword() {
		return dbpassword;
	}

	public void setDbpassword(String dbpassword) {
		this.dbpassword = dbpassword;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public static DbConfig getInstance() {
		return instance;
	}
	

}
