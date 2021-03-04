public enum Size {
    
    /*
     * Create Enums
    */
 SMALL(32, 36, "Pequeno",'S'),
 MEDIUM(37, 44, "Médio",'M'),
 LARGE(45, 52, "Grande",'L');
 
 /*
  * Atributes of Function Size
    */
 private final String description;
 private final int minValue;
 private final int maxValue;
 
 private final char code;
 
 /*
  * Private Constructor of Size
    */

 private Size(int minValue, int maxValue, String description, char code){
     this.description=description;
     this.minValue=minValue;
     this.maxValue=maxValue;
     this.code=code;
 }
 
 /*
  * Methods of Class Size
    */
 
 @Override
 public String toString() {
     return this.description;
 }
 
 public String getDescription() {
     return description;
 }
 
 public int getMinValue() {
     return minValue;
 }
 
 public int getMaxValue() {
     return maxValue;
 }
 
 public char getCode() {
     return code;
 }
}