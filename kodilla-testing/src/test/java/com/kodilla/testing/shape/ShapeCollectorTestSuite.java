package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Square(5));
        int result = shapeCollector.getSize();
        System.out.println("Testing adding a figure: " + result);
        //Then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Square(5));
        //When
        shapeCollector.removeFigure(new Square(5));
        int result = shapeCollector.getSize();
        System.out.println("Testing adding a figure: " + result);
        //Then
        Assert.assertEquals(1, result);
    }
    @Test
    public void testGetFigureNegativeIndex(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Square(5));

        //When
        Shape result = shapeCollector.getFigure(-1);
        System.out.println("Testing removing a figure: " + result);
        //Then
        Assert.assertNull(result);
    }

    @Test
    public void testGetFigurepositive(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(5,5));
        shapeCollector.addFigure(new Circle(5));

        //When
        Shape result = shapeCollector.getFigure(2);
        System.out.println("Testing removing a figure: " + result);
        //Then
        Assert.assertEquals(new Circle(5), result);
    }

    @Test
    public void testGetFigureIndexOutOfRange(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Triangle(5,5));

        //When
        Shape result = shapeCollector.getFigure(10);
        System.out.println("Testing removing a figure: " + result);
        //Then
        Assert.assertNull(result);
    }

}