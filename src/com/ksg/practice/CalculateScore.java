package com.ksg.practice;

public class CalculateScore {

	
			  public static void main(String[] args) {
			    // Set the maximum possible score in the game to 500
			    int maxScore = 500;

			    // The actual score of the user
			    int userScore = 423;

			    
			    float percentage = (float) userScore / maxScore * 100.0f;

			    
			    System.out.println("User's percentage is " + percentage);

	}

}