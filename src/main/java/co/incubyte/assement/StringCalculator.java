package co.incubyte.assement;

public class StringCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(StringCalculator.Add("1,2"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int Add(String number) throws Exception {
			int numberLength = number.length();
			if(numberLength == 0) {
				return 0;
			}
			else if(numberLength == 1) {
				return Integer.parseInt(number);
			}
			else {
				if(number.startsWith("//")) {
					String[] values = number.split("^\\w\\s]");
					int sum = 0;
					for(String val : values) {
						int temp = Integer.parseInt(val);
						if(temp > 1000) {
							temp = 0;
						}
						sum += temp;
					}
					return sum;
				}
				else {
					if(number.contains("-")) {
						throw new Exception("Negative numbers not allowed");
					}
					else if(number.contains("\n")) {
						if(number.contains(",\n")) {
							throw new Exception("Invalid Input Format");
						}
						String[] vals = number.split(",");
						int sum = 0;
						for(String va : vals) {
							if(va.contains("\n")) {
								String[] subVa = va.split("\n");
								for(String aa:subVa) {
									int temp = Integer.parseInt(aa);
									if(temp > 1000) {
										temp = 0;
									}
									sum+=temp;
								}
							}
							else {
								int temp = Integer.parseInt(va);
								if(temp > 1000) {
									temp = 0;
								}
								sum+=temp;
							}
						}
						return sum;
					}
					else {
						String[] values = number.split(",");
						int sum = 0;
						for(String value : values) {
							int temp = Integer.parseInt(value);
							if(temp > 1000) {
								temp = 0;
							}
							sum+=temp;
						}
						return sum;
					}
				}
			}
	}
}
