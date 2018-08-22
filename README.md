# Norwegian postal codes (postnummer)
This project contains a library for computations (validation and postal name lookup) on norwegian postal codes in many programming languages. The library works exactly the same in all implementations:

 * Java
 * C
 * C++
 * JavaScript
 * C#
 * PHP
 * Python
 * Visual Basic

Norwegian postal codes is called "postnummer" and "poststed" in norwegian.

The library has been made with [progsbase](https://www.progsbase.com), a tool for creating rot-resistant programs that are translatable to many programming languages.

The library can also be browsed and tested on the [progsbase repository's fodselsnummer page](https://repo.progsbase.com/repoviewer/no.inductive.libraries/postnummer/0.1.1).

![progsbase logo](/docs/images/progsbase-logo.png)

For more information about progsbase, check out: [progsbase.com](https://www.progsbase.com).

## Usage

The library has the same interface in all programming languages.

### Validate
`boolean erGyldigPostnummer(char [] nrString)`

The function takes a string as input, containing a norwegian postal code.

The output is a boolean, true if the number is valid and existing and false if not.

### Get postal place (poststed)
`char [] hentPoststed(char [] nrString, Success feilmelding)`

The function takes a string as input, containing a postal number (postnummer), and a structure for an error status and message.

The output is a string with the postal name.

If the function fails, feilmelding.success is set to false and feilmelding.feilmelding is set to a human readable error message.