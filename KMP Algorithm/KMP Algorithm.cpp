#include<bits/stdc++.h>
 
using namespace std;
int kmp(string str, string pattern) {
  int i = 0, j = 0, m = pattern.length(), n = str.length();
  pattern = ' ' + pattern; //just shifting the pattern indices by 1
  vector < int > piTable(m + 1, 0);
  for (int i = 2; i <= m; i++) {
    while (j <= m && pattern[j + 1] == pattern[i])
      piTable[i++] = ++j;
    j = 0;
  }
  j = 0;
  for (int i = 0; i < n; i++) {
    if (pattern[j + 1] != str[i]) {
      while (j != 0 && pattern[j + 1] != str[i])
        j = piTable[j];
    }
    j++;
    if (j == m) return i - m + 1;
  }
  return -1;

}
int main() {
  string pattern, str;
  cout<<"please give your pattern string :";
  cin>>pattern;
  cout<<"please write down your main string :";
  cin>>str;
  int index = kmp(str, pattern);
  if (index == -1) cout << "The pattern is not found";
  else cout << "The pattern " << pattern << " is found in the given string " 
  << str << " at " << index;
  return 0;
}