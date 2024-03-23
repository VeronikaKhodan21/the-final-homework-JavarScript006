package JavaSkript.HW006;

public class Laptop {
    private String ozy;
    private String operatingSystem;
    private int vLD;
    private String color;
    private int quantityCore;
    private int age;
    private int price;
    private int quantityInShop;
    public Laptop(String ozy,String operatingSystem,int vLD,   String color,  int quantityCore,int age, int price, int quantityInShop ){
        this.ozy = ozy;
        this.operatingSystem = operatingSystem;
        this.vLD = vLD;
        this.color = color;
        this.quantityCore = quantityCore;
        this.age = age;
        this.price = price;
        this.quantityInShop = quantityInShop;
    }
    public String getOzy(){
        return ozy;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public int getVLD(){
        return vLD;
    }
    public int getAge(){
        return age;
    }
    public int getQuantityCore(){
        return quantityCore;
    }
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantityInShop(){
        return quantityInShop;
    }
    //-------
    public void setOzy(String ozy){
        this.ozy = ozy;
    }
    public void setVLD(int vLD){
        this.vLD = vLD;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setQuantityCore(int quantityCore){
        this.quantityCore = quantityCore;
    }
    public void setColor(String color ){
        this.color = color;
    }
    public void setOperatingSystem(String operatingSystem ){
        this.operatingSystem = operatingSystem;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setQuantityInShop(int quantityInShop){
        this.quantityInShop = quantityCore;
    }
    @Override
    public String toString() {
        return "Озу: " +ozy + ". Операционная система: " + operatingSystem+ ". ОбЪём ЖД: "+ vLD+ ". Цвет: " + color+ ". Кол-во ядер: "+quantityCore + ". Цена: "+ price+ ". В МАГАЗИНЕ "+ quantityInShop+ " ТАКИХ ЭКЗЕМПЛЯРОВ.";
    }
    public boolean ozyCompar(String str){
        if (this.ozy == str) {
            return true;
        }
        return false;
    }
    public boolean operatingSystemCompar(String str){
        if (this.operatingSystem == str) {
            return true;
        }
        return false;
    }
    public boolean colorCompar(String str){
        if (this.color == str) {
            return true;
        }
        return false;
    }
    public boolean vLDCompar(int num){
        if (this.vLD == num) {
            return true;
        }
        return false;
    }
    public boolean quantityCoreCompar(int num){
        if (this.vLD == num) {
            return true;
        }
        return false;
    }
    public boolean ageExist(int num1, int num2){
        int i = this.age;
        if (i > num1 && i < num2) {
            return true;
        }
        return false;
    }
    public boolean priceExist(int num1, int num2){
        int i = this.price;
        if (i > num1 && i < num2) {
            return true;
        }
        return false;
    }
    public boolean quantityInShopExist(int num1, int num2){
        int i = this.quantityInShop;
        if (i > num1 && i < num2) {
            return true;
        }
        return false;
    }
}