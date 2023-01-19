
package Stack;
import java.util.*;
class Main {

  public static void main(String[] args) {
    System.out.print("=======================\n\n");
    Stack<String> stack = new Stack<String>();

    // stack methods:
    // 1. push => adding new item to the last index => return added item
    // 2. pop => remove item from last index => return deleted item
    stack.push("Reading Book");
    stack.push("Swimming");
    stack.push("Cooking");
    stack.push("Watching Movie");
    stack.pop();

    // print stack
    System.out.println(stack);

    System.out.print("\n=======================\n");
  }
}
