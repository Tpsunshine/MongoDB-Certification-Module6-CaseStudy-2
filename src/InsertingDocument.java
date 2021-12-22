import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertingDocument {

	public static void main(String[] args) {
		
		//Creating a Mongo Client
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Accessing the database
		MongoDatabase database = mongo.getDatabase("myDb");
		
		
		//Creating a collection
		database.createCollection("sampleCollection");
		System.out.println("Collection created successfully");
		
		
		// Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("sampleColection");
		System.out.println("Collection sampleCollection selected successfully");
		Document document = new Document("title", "MongoDB")
				.append("likes", 100)
				.append("url", "htttp://www.edureka.co/mongodb/")
				.append("by", "edureka training");
		
		//Inserting document into the collection
		collection.insertOne(document);
		System.out.println("Document inserted successfully");
		

	}

}
