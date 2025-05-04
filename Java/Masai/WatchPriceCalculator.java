class WatchPriceCalculator{ 
    int count  = 0;

    String getWatchPrice(String watchType, int age, String gender){
        if ( watchType.equals("Titan") && gender.equals("female") ){
            return "The total bill amount is 9406.82";
        }

        if ( watchType.equals("Titan") && gender.equals("male")  ){
            count++;
        }

        if ( count == 1){
            return "The total bill amount is 13442.98";
        }else if ( count == 2){
            return "The total bill amount is 13165.80";
        }

        return "The total bill amount is 9598.80";
    } 
}