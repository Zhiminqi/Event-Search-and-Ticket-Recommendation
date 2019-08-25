package db;

import db.mysql.MySQLConnection;

public class DBConnectionFactory {
	//This should change based on pipeline.
	private static final String DEFAULT_DB = "mongodb";
	
	public static DBConnection getConnection(String db){
		switch(db) {
		case"mysql":
			//return new MySQLConnection();
			return new MySQLConnection();
		case"mongodb":
				//return new MongoDBConnection();
				return null;
		default:
			throw new IllegalArgumentException("Invaild db:" + db);
		
		}
	}
	
	public static DBConnection getConnection() {
		return getConnection(DEFAULT_DB);
	}
}
