#include <iostream>
using namespace std;

bool isUnique(char *input) {
	bool bReturn = false;
	bool alphabet[26];
	for (int i = 0; i < 26; i++) {
		alphabet[i] = false;
	}

	int len = strlen(input);
	for (int i = 0; i < len; i++)
		input[i] = tolower(input[i]);

	for (int i = 0; i < len; i++) {
		int location = input[i] - 'a';

		if (alphabet[location] == true) {
			bReturn = true;
			break;
		}
		else {
			alphabet[location] = true;
		}
	}

	return bReturn;
}

void main()
{
	char input[] = "abcdefa";
	if (!isUnique(input)) {
		cout << "Unique";
	}
	else {
		cout << "Not unique";
	}
	
}
