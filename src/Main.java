import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        BlockCollectionBuilder collectBlocks = new BlockCollectionBuilder();

        ArrayList<Block> currentBlocks = collectBlocks.getAllBlocks();
//
//        int index = 0;
//        while (index < currentBlocks.size()) {
//            Block block = currentBlocks.get(index);
//
//            String LOne = block.getLetter1();
//            String LTwo = block.getLetter2();
//
//            System.out.println(LOne + LTwo);
//
//            index++;
//        }
//
//
//        for(int i = 0; i < currentBlocks.size(); i++){
//            Block block = currentBlocks.get(i);
//
//            String L1 = block.getLetter1();
//            String L2 = block.getLetter2();
//
//            System.out.println(L1 + L2);
//        }


        int cat = 0;

        do {
            Block block = currentBlocks.get(cat);

            String pepper = block.getLetter1();
            String louie = block.getLetter2();

            System.out.println(pepper + louie);

            cat++;
        }
        while (cat < currentBlocks.size());



    }
}
