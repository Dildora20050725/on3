public class Animal {
   private String name;
   private String type;

   Animal(String name, String type){
       this.name = name;
       this.type = type;
   }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setType(String type){
//        this.type = type;
//    }
//    public String getType(){
//        return type;
//    }
    public void print(){
        System.out.printf("Name: %s, Type: %s", name, type);
    }


}
// overloading funkiya 1- paremetrlar soni, 2-parametdagi ketma-ketligi, 3-qaytarilayotgan malumot turi bilan