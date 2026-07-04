package com.java.DataStructure.algorithms.General;

import java.util.HashMap;

public class LongestSubString1 {

            // Function to find and print longest
// substring without repeating characters.
            public static String findLongestSubstring(String str)
            {
                int i;
                int n = str.length();
                int st = 0;    // Starting point  // of current substring.
                int currlen = 0;      // length of // current substring.
                int maxlen = 0;  // maximum length // substring without  // repeating characters.
                int start = 0;   // starting index of  // maximum length substring.
                HashMap<Character,Integer> pos = new HashMap<>();  // Hash Map to store last  // occurrence of each// already visited character.
                pos.put(str.charAt(0), 0); // Last occurrence of first  // character is index 0;
                for (i = 1; i < n; i++)
                {
                    if (!pos.containsKey(str.charAt(i)))
                    {
                        pos.put(str.charAt(i), i);
                    }
                    else
                    {
                        // If this character is present
                        // in hash then this character
                        // has previous occurrence,
                        // check if that occurrence
                        // is before or after starting
                        // point of current substring.
                        if (pos.get(str.charAt(i)) >= st)
                        {
                            // find length of current
                            // substring and update maxlen
                            // and start accordingly.
                            currlen = i - st;
                            if (maxlen < currlen)
                            {
                                maxlen = currlen;
                                start = st;
                            }

                            // Next substring will start
                            // after the last occurrence
                            // of current character to avoid
                            // its repetition.
                            st = pos.get(str.charAt(i)) + 1;
                        }

                        // Update last occurrence of
                        // current character.
                        pos.replace(str.charAt(i), i);
                    }
                }

                // Compare length of last
                // substring with maxlen and
                // update maxlen and start
                // accordingly.
                if (maxlen < i - st)
                {
                    maxlen = i - st;
                    start = st;
                }

                // The required longest
                // substring without
                // repeating characters
                // is from str[start]
                // to str[start+maxlen-1].
                return str.substring(start,
                        start +
                                maxlen);
            }

            // Driver Code
            public static void main(String[] args)
            {
                String str = "GEEKSFORGEEKS";
                System.out.print(findLongestSubstring(str));
            }
        }


