Problem Statement
For 2 Colors in RGB: 
(R1, G1, B1) and (R2, G2, B2),

Brightness index is: 
( 299*R1 + 587*G1 + 114*B1) / 1000 

Brightness difference is: 
Absolute difference in brighness indices 

Hue difference is: 
|R1 - R2| + |G1 - G2| + |B1 - B2|
where |x| is the absolute value of x

If Brightness difference is more than 125 and the Hue difference is more than 500 then the colors have sufficient contrast

Find out if the given color combos have sufficient contrast and get all the tests passing.