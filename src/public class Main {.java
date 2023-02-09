public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        System.out.println("Hello World, Java app");
        
        sort mySort = new sort();
        ArrayList<Integer> resultList = mySort.openFile("/Users/rodrigogonzalez/randomNumbersFile.txt", "/n", new sort.ElementParser<Integer>(){
            @Override
            public Integer parseElement(String element) {
                return Integer.parseInt(element);
            }
        });
        System.out.println("Parsed elements:");
        for (Integer element : resultList) {
            System.out.println(element);
        }
    
        ArrayList<Integer> sorted1 =  mySort.gnomeSort(resultsList);
        ArrayList<Integer> sorted2 =  mySort.mergeSort(resultsList);
        ArrayList<Integer> sorted3 =  mySort.quickSort(resultsList);
        ArrayList<Integer> sorted4 =  mySort.radixSort(resultsList);
        ArrayList<Integer> sorted5 =  mySort.heapSort(resultsList); 
    }
}
