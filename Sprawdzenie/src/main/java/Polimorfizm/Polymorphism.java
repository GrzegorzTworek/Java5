package Polimorfizm;

public class Polymorphism {
    public static void main(String[] args){
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;
        plant2.grow();

        tree.shedLeaves();

        Plant plant3;

        Tree tree1;
        //tree1.grow();

        //plant3.grow();

        //plant2.shedLeavees();

        doGrow(tree);
    }
    public static void doGrow(Plant plant){
        plant.grow();
    }
}
