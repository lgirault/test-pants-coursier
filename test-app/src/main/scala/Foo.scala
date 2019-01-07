
import org.elasticsearch.index.query.InnerHitBuilder

object Foo {
 
  def main(args: Array[String]): Unit = {
    //
    val _ = new InnerHitBuilder().setSize(5)
  
  }

}
