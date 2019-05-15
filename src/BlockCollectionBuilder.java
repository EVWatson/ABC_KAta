import java.util.ArrayList;

public class BlockCollectionBuilder {

    private String letter1 = "";
    private String letter2 = "";

   private Block block;

    public BlockCollectionBuilder(){
        this.block = new Block(letter1, letter2);
    }

    /*
    TODO:
    1. pass in number of blocks to be built in method DONE
    2. work out how to put in block letters
     */

    private String[][] allLetters = {
            {"B", "O"},
            {"X", "K"},
            {"D", "Q"},
            {"C", "P"},
            {"N", "A"},
            {"G", "T"},
            {"R", "E"},
            {"T", "G"},
            {"Q", "D"},
            {"F", "S"},
            {"J", "W"},
            {"H", "U"},
            {"V", "I"},
            {"A", "N"},
            {"O", "B"},
            {"E", "R"},
            {"F", "S"},
            {"L", "Y"},
            {"P", "C"},
            {"Z", "M"}
    };

//  Loop through allLetters array, and apply to the blocks, two letters per block

    public String applyLettersToEachBlock(String[][] allLetters){
        for(int block = 0; block <= allLetters.length; block++){
            for(int letterGroup = 0; letterGroup <= allLetters[block].length; letterGroup++){
                letter1 = allLetters[block][block];
                letter2 = allLetters[letterGroup][letterGroup];
            }
        }
        return letter1 + letter2;
    }

    public ArrayList makeCollection(int noOfBlocks){
        ArrayList<Block> blockCollection = new ArrayList<>();

        for(int blocks = 1; blocks <= noOfBlocks; blocks++){
            blockCollection.add(this.block);
        }

        return blockCollection;
    }

    public Block getBlock() {
        return block;
    }
}
