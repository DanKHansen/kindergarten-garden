enum Plant:
   case Grass, Clover, Radishes, Violets

object Garden:
   def defaultGarden(encoding: String): Garden = Garden(encoding)

case class Garden(s: String):
      def plants(name: String): List[Plant] =
         val (firstRow, secondRow) = s.split("\n") match
            case Array(h, t) => (h.sliding(2, 2).toList, t.sliding(2, 2).toList)
         (firstRow(name.head - 'A') ++ secondRow(name.head - 'A')).map(c => Plant.values.find(_.toString.head == c).get).toList
