package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
		//TODO: main() is missing
    public static void main(String[] args) {

        Main main = new Main();
        main .doIt();




    }

    private void doIt()
    {

        List <GeometricShape> shapeList = new ArrayList<>();

        fillList(shapeList);

        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();

        for (GeometricShape shape : shapeList) {
            if (shape instanceof Circle)
            {
                circleList.add((Circle)shape);


            }
        }

        System.out.println("---------- only circles --------");
        for (Circle circle : circleList)
        {
            System.out.println(circle);

        }

    }


    public void fillList(List<GeometricShape> shapeList) {
		//TODO: Implement

        shapeList.add(new Circle(1,2,2.0));
        shapeList.add(new Circle(4,2,3.0));
        shapeList.add(new Circle(3,2,1.0));
        shapeList.add(new Rectangle(3,4,10.1,12.2));
        shapeList.add(new Rectangle(4,3,15.1,14.2));
        shapeList.add(new Rectangle(5,2,3.1,12.5));
        shapeList.add(new Rectangle(6,1,1.1,2.9));
        shapeList.add(new RightTriangle(4,3,10.1,12.2));



    }


    public void printList(List<GeometricShape> shapeList) {
		//TODO: Implement

        System.out.println("---------- for loop ----------");
        for (int pos = 0; pos < shapeList.size(); pos++) {          // worst way

            System.out.println(shapeList.get(pos));

        }

        System.out.println("---------- for each ----------");
        for (GeometricShape shape : shapeList) {                    // better way

            System.out.println(shape);

        }

        System.out.println("---------- stream ----------");
        shapeList.stream().forEach(shape -> System.out.println(shape) );  // NEW WAY IN JAVA 8

        System.out.println("---------- stream 2----------");
        shapeList.stream().forEach(System.out::println);


    }

}
