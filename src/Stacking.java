import java.util.ArrayList;
import java.util.List;

class Stacking
{
    public final List<Integer> myStack;

    public Stacking(int stackSize)
    {
        myStack = new ArrayList<>(stackSize);
    }

    public boolean isEmpty()
    { //check if empty
        if (myStack.isEmpty()) {
            return true;
        }
        else
        {
            return false;
        }
    }

    //push() method: takes an int parameter type and adds it to
    //the first position of the list
    public void push(int element)
    {
        myStack.add(0, element);
    }

    //pop() function: checks if the stack is empty and,
    //if not, removes the element at the top of the stack
    public int pop()
    {
        if (!myStack.isEmpty())
        {
            int element = myStack.get(0);
            myStack.remove(0);
            return element;
        }
        else
        {
            return -1;
        }
    }
    //peek() function: returns element at top of stack
    public int peek() {
        if (!myStack.isEmpty()) {
            return myStack.get(0);
        } else {
            return -1;
        }
    }

    //function to see all elements in stack
    public List<Integer> getAllItems()
    {
        return myStack;
    }

        //function to see minimum element in stack:
        public void getMin()
        {
           int min = myStack.get(0);
           for (int i = 1; i < myStack.size(); i++)
           { //if current variable less than min, update min
               if (min > myStack.get(i))
                   min = myStack.get(i);
           }
           System.out.println(min);

        }

        }

