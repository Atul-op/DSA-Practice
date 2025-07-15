// Last updated: 7/15/2025, 3:23:03 PM
class Solution
{
    public String numberToWords(int num)
    {
        if(num <= 19)
        {
            return switch(num)
            {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                case 10 -> "Ten";
                case 11 -> "Eleven";
                case 12 -> "Twelve";
                case 13 -> "Thirteen";
                case 14 -> "Fourteen";
                case 15 -> "Fifteen";
                case 16 -> "Sixteen";
                case 17 -> "Seventeen";
                case 18 -> "Eighteen";
                case 19 -> "Nineteen";
                default -> "Invalid";
            };
        }
        int digit = 1 + (int)Math.log10(num);
        String ans = "";
        switch(digit)
        {
            case 2 -> { 
                ans = switch (num/10) {
                    case 2 -> "Twenty";
                    case 3 -> "Thirty";
                    case 4 -> "Forty";
                    case 5 -> "Fifty";
                    case 6 -> "Sixty";
                    case 7 -> "Seventy";
                    case 8 -> "Eighty";
                    case 9 -> "Ninety";
                    default -> "Invalid";
                };
                if(num%10 != 0)
                    ans += " "+numberToWords(num%10);
            }       
       
            case 3 -> { 
                ans = numberToWords(num/100);
                ans += " Hundred";
                if(num%100 != 0)
                    ans += " "+numberToWords(num%100);
            }
            case 4, 5, 6 -> {
                ans = numberToWords(num/1000);
                ans += " Thousand";
                if(num%1000 != 0)
                    ans += " "+numberToWords(num%1000);
            }
            case 7, 8, 9 -> {
                ans = numberToWords(num/1000000);
                ans += " Million";
                if(num%1000000 != 0)
                    ans += " "+numberToWords(num%1000000);
            }
            case 10 -> {
                ans = numberToWords(num/1000000000);
                ans += " Billion";
                if(num%1000000000 != 0)
                    ans += " "+numberToWords(num%1000000000);
            }
        }
        return ans;
    }
}