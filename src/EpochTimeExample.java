// 년도 월 일 시 분 초 요일 위크까지 출력 할 수 있도록 
public class EpochTimeExample {

	public static void main(String[] args) {
		long epoch = System.currentTimeMillis()/1000 + 3600*9;//한국기준으로 9시간 더해줌, 단위는 초
		//epoch time(unix time) : 1970/01/01 00:00:00 ~ 경과시간  pc시간기준
		System.out.println(epoch);
		int year = 1970;
		for(;;) {
			boolean isLeap = (year%4 == 0 && year%100!=0) || (year%400 == 0); //윤년인지 확인
			int daysOFYear = isLeap ? 366 : 365;
			if (epoch-daysOFYear*24*3600 >= 0) {
				epoch = epoch - daysOFYear*24*3600;
				year++;
			}else
				break;
			
		}
		System.out.println(year);
		System.out.println(epoch);   
		
		long days = epoch/(3600*24); // 194days
		long one_day_time = epoch%(3600*24); // 50000
		long one_day_hour = one_day_time/3600;
		long one_hour_minute = one_day_time%3600/60;
		long one_second = one_day_time%3600%60;
				
		long thour = 0;
		int m = 0;
		System.out.println(days);
//		System.out.println(hour);
/*		for(int i=1; i<=days; i++) {
			if(i>=31){
			   System.out.printf("1월 %d일\n", i);
			   SSystem.out.println  
             }
			   }
			}
			else if(month==4||month==6||month==9||month==11) {
			   days = days - (month*30);
			   if(days<0) {
				   month--;
				   System.out.println(month);
				   break;
			   }
			}
			else if(month==2 && ((year%4 == 0 && year%100!=0) || (year%400 == 0))) {
				days = days - (month*29);
				if(days<0) {
					month--;
					System.out.println(month);
					break;
				}
			}
			else {
				days = days - (month*28);
				if(days<0) {
					month--;
					System.out.println(month);
					break;
				}
			}
			
		}
			
		System.out.println(days);	
	*/		
	}

}

 /*   int month = 0;
//    int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};           배열로도 만들어보자 코드가 간단해진다
//    boolean isLeap = (year%4 == 0 && year%100!=0) || (year%400 == 0);
//      if(isLeap)
//    	  dayOfMonth[1] = 29;
    
    
    for(int i=1; i<12; i++) {
	 int daysOfMonth = 0;
	 switch(i) {
	 case 1:
	 case 3:
	 case 5:
	 case 7:
	 case 8:
	 case 10:
	 case 12:
		 daysOFMonth = 31;
		 break;
	 case 2:
		 boolean isLeap = (year%4 == 0 && year%100!=0) || (year%400 == 0);
		 daysOfMonth = isLeap ? 29:28;
		 break;
	 default:
		 daysOfMonth = 30;
		 break;
			 
		 
	 
	 }
	 
	 
	 
	 
//	 if(epoch - daysOfMonth*24*60*60 >= 0) {
//	    epoch = epoch - dayOfMonth*24*60*60;
//	    continue;
//	  }
	  
//    }
 *    
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
