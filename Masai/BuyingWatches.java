class WatchPriceCalculator{


    public double rolexWatch(double discountPercentage){
        double watchPrice = 10999.00;
        double gst = 12.5;
        double profitPercentage = 13.5;

        double watchWithGst = ( watchPrice * gst ) / 100;
        double watchWithProfit = ( watchPrice * profitPercentage ) / 100;

        double total = watchPrice + watchWithGst + watchWithProfit;

        if (discountPercentage == 0){
            return total;
        }

        double discountAmount =  ( total * discountPercentage ) / 100;
        return total - discountAmount;
    }

    public double titanWatch(double discountPercentage){
        double watchPrice = 7999.00;
        double gst = 7.5;
        double profitPercentage = 12.5;

        double watchWithGst = ( watchPrice * gst ) / 100;
        double watchWithProfit = ( watchPrice * profitPercentage ) / 100;

        double total = watchPrice + watchWithGst + watchWithProfit;

        if (discountPercentage == 0){
            return total;
        }

        double discountAmount =  ( total * discountPercentage ) / 100;
        return total - discountAmount;
    }

    double getWatchPrice(String watchType, int age, String gender){
        double discountPercentage = 0.0;

        if ( age >=  60 ) discountPercentage += 3.0;
        if ( gender.equals("female") ) discountPercentage += 2.0;

        if ( watchType.equals("Rolex") ){
            return rolexWatch(discountPercentage);
        }

        return titanWatch(discountPercentage);
    }

} 
