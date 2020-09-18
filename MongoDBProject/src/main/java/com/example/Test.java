package com.example;


import java.util.Iterator;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongo = MongoClients.create("mongodb://127.0.0.1:27017");
		MongoDatabase database = mongo.getDatabase("batch52");
		MongoCollection<Document> collection = database.getCollection("EMPLOYEE");
		FindIterable<Document> iterDoc = collection.find();
		Iterator<Document> it = iterDoc.iterator();
		
		while(it.hasNext()) {
			Document d = it.next();
			String name = d.getString("EMP_NAME");
			System.out.println("Name: " + name);
			
		}
		
		
	}

}
