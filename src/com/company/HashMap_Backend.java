package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HashMap_Backend {

    private final Map<Long, String> dataStore;
    private final int primeNumber;
    private final String secretKey;

    public HashMap_Backend(int primeNumber, String secretKey) {
        this.dataStore = new LinkedHashMap<>();
        this.primeNumber = primeNumber;
        this.secretKey = secretKey;
    }

    private long generateKey() {
        Random random = new Random();
        long randomMultiplier = random.nextLong();

        // Generate key using random number, prime number, and secret key
        long key = randomMultiplier * primeNumber * secretKey.hashCode();

        // Hash key along with current time and data
        key = hashKey(key, System.currentTimeMillis(), "additional_data");

        return key;
    }

    private long hashKey(long key, long currentTime, String additionalData) {
        // Hashing logic (you can replace this with your specific hashing algorithm)
        String concatenatedString = key + "_" + currentTime + "_" + additionalData;
        return concatenatedString.hashCode();
    }

    public long write(String jsonData) {
        long key = generateKey();
        dataStore.put(key, jsonData);
        System.out.println("Data added with key: " + key);
        return key;
    }

    public void addMany(List<String> jsonDataList) {
        for (String jsonData : jsonDataList) {
            write(jsonData);
        }
    }

    public String findById(long key) {
        return dataStore.get(key);
    }

    public List<String> findAll() {
        return new ArrayList<>(dataStore.values());
    }

    public static void main(String[] args) {

        int primeNumber = 17;
        String secretKey = "DO_Nothing";

        HashMap_Backend backend = new HashMap_Backend(primeNumber, secretKey);

        // Add JSON-formatted data
        String jsonData1 = "{\"name\":\"Suraj\",\"age\":30,\"birthday\":\"1992-05-15\",\"salary\":50000,\"position\":\"Developer\"}";
        String jsonData2 = "{\"name\":\"Rahul\",\"age\":25,\"birthday\":\"1997-08-22\",\"salary\":60000,\"position\":\"Designer\"}";

        long generatedKey  = backend.write(jsonData1);
        backend.addMany(List.of(jsonData2));

        // Retrieve data
        String retrievedData = backend.findById(generatedKey);
        List<String> allData = backend.findAll();

        System.out.println("Retrieved data for key " + generatedKey + ": " + retrievedData);
        System.out.println("All data in the database: " + allData);

    }
}
