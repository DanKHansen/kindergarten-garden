enum Plant:
   case Grass, Clover, Radishes, Violets

object Garden:
   def defaultGarden(encoding: String): Garden = Garden(encoding)

   case class Garden(enc: String):
      def plants(name: String): List[Plant] = ???


