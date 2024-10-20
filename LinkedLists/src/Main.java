import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        // adding Sydney to the end of the list
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);

        printItinerary(placesToVisit);

        printItinerary3(placesToVisit);

        testIterator(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        // list methods
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // stack methods
        list.push("Pushed element");

    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");
        list.remove();
        list.removeFirst();
        list.removeLast();

        //queue/dequeue poll methods
        list.poll();
        list.pollFirst();
        list.pollLast();

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        list.pop();
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved element = " + list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.indexOf("Darwin"));
        System.out.println(list.lastIndexOf("Melbourne"));

        // queue retrieval
        System.out.println(list.element());
        // stack retrieval
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town: list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {

        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
                iterator.add("Lake Wive");
            }
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println(list);
    }
}
