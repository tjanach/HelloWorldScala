package main.scala.interoperability

/*
* java singleton based on static
* public final class Camera(){
*   Camera(){};
*   static Camera camera;
*   public static Camera getSingleton(){
*     if (camera==null){
*       camera = new Camera();
*     }
*     return camera;
*   }
* }
*
*
* */

//in scala

object CameraB{
  override def toString() = {"CameraB Singleton"}
}

object MyCameraApp extends App {
  println(CameraB)
}
