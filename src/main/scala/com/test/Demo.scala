package com.test

import com.test.Point
import com.test.Location

object Demo {

  def  main(args:Array[String]){
    val pt = new Point(10, 20);
    pt.move(10, 10);

    val loc = new Location(10,20,15);
    loc.move(5,5,5);



  }

}