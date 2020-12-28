package org.ieti.lucrarea6;

public class Main {
	public static void main(String[] args) {
		SubscriptionPlan plan = new SubscriptionPlan(71, "Plan Out!");
		FileUtility.writeToFile(plan);

		SubscriptionPlan subscriptionPlan = FileUtility.readFromFile();
		System.out.println(subscriptionPlan.toString());
	}
}
