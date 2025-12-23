public static void main(String[] args)
{
    // Create a StringBuilder
    StringBuilder sb = new StringBuilder("Hello");

    // Creare a StringBuffer
    // StringBufffer sb = new StringBuffer("Hello");

    // Append a string
    sb.append(" World");
    System.out.println(sb);  // Hello World

    // Insert at a specific position
    sb.insert(5, " Java");
    System.out.println(sb);  // Hello Java World

    // Replace part of the string
    sb.replace(6, 10, "Beautiful");
    System.out.println(sb);  // Hello Beautiful World

    // Reverse the string
    sb.reverse();
    System.out.println(sb);  // dlroW lufituaeB olleH

    // Convert back to an immutable String
    String finalString = sb.toString();
    System.out.println(finalString);
}