package CreationalPattern4;

public class Vegburger extends Hamburger {

   @Override
   public float price() {
      return 25.0f;
   }

   @Override
   public String name() {
      return "Veg Burger";
   }
}