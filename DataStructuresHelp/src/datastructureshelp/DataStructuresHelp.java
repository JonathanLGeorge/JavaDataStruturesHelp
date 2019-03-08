package datastructureshelp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author Jonathan
 */
public class DataStructuresHelp {

    public static void main(String[] args) {

        //Array List examples
        String[] gen5 = {"PS4", "Xbox360", "PC"};
        String[] nintendo = {"3Ds", "Switch"};
        String[] boardGame = {"boardGame"};

        VideoGame game1 = new VideoGame("Devil May Cry 5", 2019, "M", gen5);
        VideoGame game2 = new VideoGame("Super mario 3d land", 2019, "E", nintendo);
        VideoGame game3 = new VideoGame("Catan", 2001, "N/A", boardGame);

        ArrayList<VideoGame> games = new ArrayList<>();

        games.add(game1);
        games.add(game2);
        games.add(1, game3);

        // this is going to invoke tostring method inside VideoGame
        System.out.println(games.toString());
        
        
        //different way to add items in the list
        ArrayList<String> food = new ArrayList(Arrays.asList("meat",
                "bread", "cheese", "veggies"));
        
        ArrayList<String> poison = new ArrayList<>();
        poison.add("Benzoic acid");
                poison.add("sugar");
        poison.add("Calcium Sorbate");
        poison.add("Potassium Nitrate");

        
        food.addAll(poison);
        
        System.out.println(food);
        
        
        //removing items
        if(food.contains("sugar")){
            food.remove("sugar");
            food.remove("Calcium Sorbate");
        }
        System.out.println(food);
        
        
        

        /* *******************************************************************
        Iterable examples
        ******************
        hasNext()
        next()
        remove()
        foreach()
        iterator()
        previous()
        hasPrevious()
        previousIndex()
         */
        Collection collection = Arrays.asList("red", "orange", "green", "blue",
                "red");

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //linked list examples
        LinkedList boardGames = new LinkedList();

        //this will be my linked list order....
        boardGames.add("Five Tribes");
        boardGames.add("Tzolk'in");
        boardGames.add("Trickerion");
        boardGames.add("Great Western Trail");
        boardGames.add("Concordia");
        boardGames.add("A Feast For Odin");

        boardGames.addFirst("Alchemist");
        System.out.println(boardGames);
        //lets use an iterator 

        System.out.println("last gamein my collection: " + boardGames.getLast());

        //allows us to change size of list
        ListIterator iter = boardGames.listIterator(boardGames.size());

        //print in reverse
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }

        //vector examples. this will look very much like array list
        Vector vgames = new Vector();
        vgames.add(game1);
        vgames.add(game2);
        vgames.add(game3);

        System.out.println(vgames);

        /* ****************************************************************8
        stacks examples: LIFO
        
            push()
            pop()
            peek()
         */
        Stack stack = new Stack();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
            System.out.print(",");

        }
        System.out.println("Launch!");

        
        
        
        
        /* **************************************************************8
        Queue FIFO
        add()    - used to add element at end of queue
        peek()   - returns a copy of first elemrnt
        remove() - removes the top; error if empty
        poll()   - removes from the top; returns null if empty 
        
        */
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        System.out.println("list of items in the queue: " + queue);
        
        int removed = queue.remove();
        System.out.println(removed + "was removed");
        
        //seethe next in line
        int top = queue.peek();
        System.out.println("next item up: " + top);
        System.out.println(queue);
    }
}
