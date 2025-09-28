package Reviews;

public class Hex{
	  private final int value;

	  public Hex(int value){
		  this.value = value;
	  }
	  
	  public int valueOf(){
		  return value;
	  }
	  
	  public String toJSON(){
		  return "0x" + Integer.toHexString(value).toUpperCase();
	   }
	  
	  public String toString(){
		  return toJSON();
	  }
	  
	  public Hex plus(Hex other){
		  return new Hex(this.value + other.valueOf());
	  }
	  
	  public Hex minus(Hex other){
		  return new Hex(this.value - other.valueOf());
	  }
	  
	  public Hex plus(int number){
		  return new Hex(this.value + number);
	  }
	  
	  public Hex minus(int number ){
		  return new Hex(this.value - number);
	  }
	  
	  public static int parse(String string){
		  String cut = string.trim().toUpperCase().replace("0X", "");
		  return Integer.parseInt(cut, 16);
	  }
	  
	  @Override
	  public boolean equals(Object other){
		  if(!(other instanceof Hex)) return false;
		  return (this.value == ((Hex) other).valueOf());  
	  }
	}