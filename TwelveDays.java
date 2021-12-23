/*Instructions
Output the lyrics to 'The Twelve Days of Christmas'.

On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.

On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.

On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.
*/

class TwelveDays {
    String verse(int verseNumber) {
         switch(verseNumber)
                    {
                        case 1:return "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n";
                           
                        case 2:return "On the second day of Christmas my true love gave to me: two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
                            
                        case 3:return "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
                            
                        case 4:return "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " +"two Turtle Doves, and a Partridge in a Pear Tree.\n";
                           
                        case 5:return "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            
                        case 6:return "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                           
                        case 7:return "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +"six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
                            
                        case 8:return "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +"seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                        case 9:return "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +" seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                           
                        case 10:return "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +
                " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            
                        case 11:return "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " +
                "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
                "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
                        case 12:return "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " +
                "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    }
        return "";
    }
    String verses(int startVerse, int endVerse) {
        String str="";
        for(int i=startVerse;i<=endVerse;i++)
            {
                switch(i)
                    {
                        case 1:str=str+"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n";
                            break;
                        case 2:str=str+"On the second day of Christmas my true love gave to me: two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
                            break;
                        case 3:str=str+"On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
                            break;
                        case 4:str=str+ "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " +"two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            break;
                        case 5:str+="On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            break;
                        case 6:str+="On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            break;
                        case 7:str+="On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +"six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
                            break;
                        case 8:str+="On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +"seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            break;
                        case 9:str+="On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +" seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            break;
                        case 10:str+="On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +
                " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            break;
                        case 11:str+="On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " +
                "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
                "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
                            break;
                        case 12:str+="On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " +
                "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                            break;
                    }
                if(i<endVerse){str+="\n";}
            }
        return str;
    }
    
    String sing() {
        return "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +
                "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +
                " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +
                " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " +
                "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
                "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " +
                "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    }
}
