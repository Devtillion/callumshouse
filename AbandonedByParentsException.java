public class AbandonedByParentsException extends RuntimeException{
   /**
   *
   */
   
   public AbandonedByParentsException(Human human) {
      this(human.name + "\'s mom decided to pass out after seeing " + human.name + "..... " + human.name + "\'s dad just went out to buy a milk");
   }
}
