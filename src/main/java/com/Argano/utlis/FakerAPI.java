package com.Argano.utlis;

import java.util.Locale;


import com.github.javafaker.Faker;

public class FakerAPI {


    private static final Faker faker = new Faker(new Locale("en-IND")); 
		
		private FakerAPI() {
			 
		}

		public static String getCompanyName() {
			return faker.company().name().replaceAll("[^a-zA-Z ]", "");
		}

		public static String getUrl() {
			return faker.company().url();
		}

		public static String getAddress() {
			return faker.address().streetAddress();
		}
		
		public static String getCity() {
			return faker.address().city();
		}

		public static String getCountry() {
			return faker.country().toString();
		}

		public static String getUserName() {
			return faker.name().username();
		}
		
		
		public static String getFirstName() {
			return faker.name().firstName();
		}
		public static String getMiddleName() {
			return faker.name().nameWithMiddle();
		}
		public static String getLastName() {
			return faker.name().lastName();
		}
		
		public static String getEmailAddress() {
			return faker.internet().emailAddress();
		}
		
		public static String getContactNumber() {
			return faker.phoneNumber().cellPhone();
		}

		public static String getBankAccountNumber() {
			return ""+faker.number().randomNumber(8, false);
		}
		
		public static String getRandomNumber() {
			return ""+faker.number().randomNumber(9, false);
		}
		
		public static String getSwiftCode() {
			return ""+faker.number().randomNumber(4, false);
		}
		public static String getTaxNumber() {
			return ""+faker.number().randomNumber(7, false);
		}
		
		public static String getRating() {
			return faker.options().option("Hot","Warm", "Cold");
		}
		
		public static String getSalutation() {
			return faker.options().option("Mr.","Ms.", "Mrs.", "Dr.", "Prof.");
		}
		
		public static String getTitle() {
			return faker.options().option("Mr","Ms", "Mrs");
		}
		
		public static String getGender() {
			return faker.options().option("Male","Female");
		}


		public static String getAge() {
			return faker.options().option("04/06/1996");
		}

		public static String getMarriagestatus() {
			return faker.options().option("Single","Married","Divorced","Widowed");
		}
		public static String getEmploymentstatus() {
			return faker.options().option("Full-time","Part-time","Unemployed");
		}

		public static String getAcctype() {
			return faker.options().option("Checking","Savings");
		}
		public static String getNickname() {
			return faker.options().option("akash");
		}

		public static String getLoginUsername() {
			return faker.options().option("Vishak");
		}
		public static String getLoginPassword() {
			return faker.options().option("vishak123");
		}

		public static String getPincode() {
			return faker.options().option("6000456","650786");
		}

		public static String getLandmark() {
			return faker.options().option("Near southlane","Near officevista");
		}

		public static String getplace() {
			return faker.options().option("Dertv","Loakas");
		}


	}







