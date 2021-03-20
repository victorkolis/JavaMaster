class Main {
	public static void main(String[] args) {
		/* Must check whether there is enough space
		* On the bus for the passengers in wait.
		* If there are more people out than the max capacity
		* Return the number of people that won't be able to get in
		* Otherwise return 0. 
		*/
		
		System.out.println(enough(10, 5, 3));
		
	}
	
	public static int enough(int bus_capacity, int people_on_the_bus_already, int people_in_wait) {
		int max_capacity = people_on_the_bus_already + people_in_wait - bus_capacity;
		if(max_capacity < 0){
			return 0;
		} else {
			return max_capacity;
		}
		
	}
}
