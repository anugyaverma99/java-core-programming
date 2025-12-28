import java.util.Scanner;
public class ticketBookingSystem{
	public static void main(String[] args){

		// STEP 1: PASSENGER INPUT
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the passenger ID: ");
		int empl_id=sc.nextInt();
		System.out.print("Enter the passenger name: ");
		String empl_name=sc.next();
		System.out.print("Enter the employee age: ");
		int empl_age=sc.nextInt();
		System.out.print("Enter the travel type(1-bus, 2-train, 3-flight: ");
		int travel_type=sc.nextInt();
		System.out.print("enter the base fare: ");
		double base_fare=sc.nextDouble();
		System.out.print("is government employee? true/false: ");
		boolean is_empl=sc.nextBoolean();

		//STEP 2: AGE & ELIGIBILTY VALIDATION

		if(empl_age<5){
			System.out.println("FREE TICKET ,no booking required");
		}
		else if(empl_age>80){
			System.out.println("MEDICAL CLEARANCE  REQUIRED");

		}
		else{

			// STEP 3 & 4: DECIDING TRAVEL CLASS & TYPE && APPLYING MULTIPLIER BASED ON THAT 


			String travel_cl="";
			double multiplier=0.0;

			switch(travel_type){
			case 1:
				System.out.println("Enter travel_Class(1-sleeper 2-seater): ");
				int travel_class1=sc.nextInt();
				switch(travel_class1){
				case 1:
					travel_cl="sleeper";
					multiplier=1.2;
					break;
				case 2:
					travel_cl="seater";
					multiplier=1.0;
					break;
				default:
					travel_cl="invalid travel_class choosen";
					break;
				}
				break;
				case 2:
				System.out.println("Enter travel_Class(1-general 2-sleeper 3- AC): ");
				int travel_class2=sc.nextInt();
				switch(travel_class2){
				case 1:
					travel_cl="general";
					multiplier=1.0;
					break;
				case 2:
					travel_cl="sleeper";
					multiplier=1.3;
					break;
				default:
					travel_cl="AC";
					multiplier=1.6;
					break;
				}
				break;
			case 3:
				System.out.println("Enter travel_Class(1-economy 2-business): ");
				int travel_class3=sc.nextInt();
				switch(travel_class3){
				case 1:
					travel_cl="economy";
					multiplier=2.5;
					break;
				case 2:
					travel_cl="business";
					multiplier=3.5;
					break;
				default:
					travel_cl="invalid travel_class choosen";
					break;
				}
				break;

			default:
				System.out.println("Invalid travel_type choosen");
			}

			double fare_after_class=base_fare*multiplier;

			//STEP 5: DISCOUNT CALC.

			 double discount=0.0;
			 if(empl_age>=60){
			 	discount=fare_after_class*30/100;
			 }
			 else if(is_empl){
			 	discount=fare_after_class*15/100;
			 }
			 else if(empl_age>5 && empl_age<12){
			 	discount=fare_after_class*50/100;
			 }
			 else{
			 	discount=0.0;
			 }

			 double final_fare=fare_after_class-discount;

			 // STEP 6: BOOKING STATUS 

			 String booking_status="";

			 if(final_fare>=10000){
			 	if(travel_type==3){
			 		booking_status="BOOKING STATUS CONFIRMED";

			 	}
			 	else{
			 		booking_status="WAITING LIST";
			 	}
			 }
			 else{
			 	booking_status="BOOKING STATUS CONFIRMED";
			 }

			 System.out.println("PASSENGER ID: "+empl_id);
			 System.out.println("PASSENGER NAME: "+empl_name);
			 System.out.println("TRAVEL TYPE: "+travel_type);
			 System.out.println("TRAVEL CLASS: "+travel_cl);
			 System.out.println("BASE FARE: "+base_fare);
			 System.out.println("FINAL FARE: "+final_fare);
			 System.out.println("DISCOUNT: "+discount);
			 System.out.println("BOOKING STATUS: "+booking_status);





		}

	}
}