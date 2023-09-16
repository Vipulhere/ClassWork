function areIsomorphic(str1, str2){
	var charCount = {};
	var c = "a";
	for (var i = 0; i < str1.length; i++){ 
		if (charCount.hasOwnProperty(str1[i]))
		{
			c = charCount[str1[i]];
			if (c != str2[i])
				return false;
		}
		else if (!Object.values(charCount).includes(str2[i]))
		{
			charCount[str1[i]] = str2[i];
		}
		else
			return false;
	}
	return true;
}
var str1 = "aaz";
var str2 = "prq";

if (str1.length == str2.length && areIsomorphic(str1, str2))
	console.log(true)
else
	console.log(false)

/*
    It creates an empty dictionary charCount to store the mapping between the characters of the two strings.
    It initializes a variable c to the first character of str2.
    It iterates over the characters of str1.
    If the current character of str1 is already in the dictionary, then the function checks if the corresponding value in the dictionary is equal to the current character of str2. If they are not equal, then the function returns false.
    If the current character of str1 is not in the dictionary, then the function checks if the current character of str2 is already in the dictionary. If it is, then the function returns false.
    Otherwise, the function adds the current character of str1 to the dictionary and maps it to the current character of str2.
    The function returns true if it reaches the end of the loop without returning false.
*/  
