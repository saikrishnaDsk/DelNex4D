#include <stdio.h>

void main()
{
  int c = 0, vowels = 0,cons=0;
  char s[1000];
  gets(s);

  while (s[c] != '\0') {
    if (s[c] == 'a' || s[c] == 'A' || s[c] == 'e' || s[c] == 'E' || s[c] == 'i' || s[c] == 'I' || s[c] =='o' || s[c]=='O' || s[c] == 'u' || s[c] == 'U')
      vowels++;
    else
      cons++;
c++;
  }
  printf("%s",strrev(s));
  printf("Number of vowels and consonants in the string: %d %d",vowels,cons);
  
}

