package laurasoft;

import org.apache.commons.math3.stat.StatUtils;

import java.util.List;

/** Class including some statistics methods for arrays of numbers */
public class Statistics {

    public double multiplyValues(double[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        double product = 1.0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            product *= arrayOfNumbers[i];
        }

        return product;
    }

    public double maximumValue(double[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        double max = arrayOfNumbers[0];
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > max) {
                max = arrayOfNumbers[i];
            }
        }
        return max;
    }

    public double minimumValue(double[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        double min = arrayOfNumbers[0];
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < min) {
                min = arrayOfNumbers[i];
            }
        }
        return min;
    }

    /**
     * Hola mundo
     * @param arrayOfNumbers jelou
     * @return bai
     */
    public double mean(double[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        double sum = 0.0;
        for (double num : arrayOfNumbers) {
            sum += num;
        }
        return sum / arrayOfNumbers.length;
    }

    public double median(double[] array0fNumbers) {
        if (array0fNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        return StatUtils.percentile(array0fNumbers, 50.0);
    }

    public double sumValue(double[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        if (arrayOfNumbers.length > 10) {
            throw new IllegalArgumentException("Array must not be have more than 10 numbers");
        }

        if (arrayOfNumbers.length > 5) {
            throw new IllegalArgumentException("Brotha, the array is way too long yo");
        }

        double sum = 0;
        for(double number: arrayOfNumbers){
            sum += number;
        }

        return sum;
    }


}
