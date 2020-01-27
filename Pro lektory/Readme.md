Lektorska slozka
================

Tato slozka obsahuje informace pro lektory. Neni urcena ke sdileni se studentkami.



Casovy harmonogram
------------------

1. Predstaveni, co je to programovani
    - Moc obecne povidani neprotahujte. Studentky jsou natesene na to, ze si vyzkouseji programovat, tak je dobre
      o jejich nadseni neprijit dlouhym uvodem.

1. Kratke predstaveni Javy a proc mame editor IntelliJ IDEA
    - Ukazka otevirani projektu.
        - Otevreni a zavreni DemoApplication
    - Projekt je slozka, ve ktere je "src" a konfiguracni soubory
    - Nicmene programy lze psat i bez jakehokoliv IDE a bez zakladani nejakych projektu

2. Volani funkci, promenne
    - Otevreni existujiciho prazdneho projektu s `main(...)`, ve kterem je `System.out.println()`
    - Volani funkci
        - Spolecne kodovani
        - `System.out.println()`
        - `System.out.print()`
        - `Math.random()`, ...
    - Prace s promennymi
        - Spolecne kodovani
        - Typy promennych: `int`, `double`, `String`, `boolean`
        - Zmineni, ze nektere jazyky nerozlisuji mezi `int` a `double`, nektere vubec mezi typy
        - Proc vubec maji promenne typy
    - Nacitani hodnot do promenne od uzivatele
        - Spolecne kodovani s malymi samostatnymi ukolecky pro rychlejsi studentky
        - `TextConsole.readInt()`, `TextConsole.readDouble()`, `TextConsole.readLine()`

3. (Obed)

4. Samostatna prace s promennymi (podle zadani v dokumentu Priklady_na_promenne-Java.docx)

5. Diskuse o tom, jak se dostat do IT
    - Treba ze programovani je v IT ve skutecnosti minorita (treba 5 %)
    - V IT je spousta jinych odbornych pozic (testeri, analytici, ...)
    - Platy v IT
    - Moznost casove flexibilni prace i z domova atd.

5. Podminky a cykly
    - Prikaz `if`
        - Spolecne kodovani
        - Ukazka `if`, `if-else`
    - Cyklus `while`
        - Spolecne kodovani
    - Cyklus `for`
        - Spolecne kodovani
        - Pro pokrocile vysvetleni 3 casti cyklu `for`. Zduraznete, ze neni treba je chapat, staci vymenovat horni limit cyklu

5. Samostatna prace s Angry_Birds
    - Pro zacatecniky: code.org -> Studenti -> Klasicke bludiste ( https://studio.code.org/hoc/1 ), pak to opsat do Javy
    - Pro pokrocilejsi: Rovnou psat prikazy v Jave

6. Motivace do dalsiho programovani



Video z minulych behu
---------------------

Pro inspiraci, odkazy na videa z minula:

- Uvod do programovani 25. 1. 2020
<https://www.youtube.com/watch?v=VLmw5oaKkag>

- Uvod do programovani 8. 12. 2018
<https://www.youtube.com/watch?v=rWg1ibqk55I>



Instalace
---------

Je treba, aby studentky provedly pokyny k instalaci v klidu doma. Instalace je ve forme prednastaveneho archivu `zip`. **Neni to jen popis**, jake produkty si maji stahnout a nainstalovat, ale naopak je to cele uz nainstalovane a nastavene. Jeden `zip`, ktery si jen rozbali a funguje to. To je velmi dulezite. Nastavit dohromady vyvojove nastroje v javovem svete dnes uz neni zadna hracka ani pro zkuseneho javistu. Je treba nastavit IntelliJ IDEA na JDK, Maven na JDK, IntelliJ IDEA na Maven, pripadne IntelliJ IDEA na Tomcat, Maven na Tomcat, Maven na repository, a spousty dalsich veci.
Myslenka je podobna treba XAMPu, ktery se taky da jen stahnout, rozbalit a pouzivat.

Detailni pokyny k instalaci jsou na webu. Zaslete odkaz studentkam zhruba tyden pred akci:
<https://javainstall.czechitas.cz/community/>



Priklady
--------

Studentky si stahly instalacku, ale ta je univerzalni pro vsechny moje javove kurzy.
Na workshopu si jeste budou potrebovat stahnout priklady, ktere si vlozi nejlepe do `C:\Java-Training\Projects\Java-Uvod-1` (nebo `~/Java-Training/Projects/Java-Uvod-1` na macOS).
Doporucuji pripravit si soubor `zip` se vsemy priklady, nahrat ho na GDrive a nechat sdilet s kymkoliv, kdo dostane odkaz. Do prezentace pak dat bit.ly na ten GDrive.

Priklady jsou vzdycky ve forme zadani a reseni. Jsou cislovane po desitkach, aby se pekne zatridily ve slozce kurzu.
Napriklad:

| Nazev slozky            | Typ
|-------------------------|------------
| 10-Piskvorky-Zadani     | Vychozi projekt
| 11-Piskvorky-Reseni     | Cilovy projekt, info pro lektora, kam zhruba dojit
| 20-Pexeso-Zadani        | Vychozi projekt
| 21-Pexeso-Reseni        | Cilovy projekt, info pro lektora, kam zhruba dojit

Pokud je k dispozici jen reseni, znamena to, ze si mate se studentkami zalozit zadani jako novy cisty projekt.
Typicky ze sablony, tzn. IntelliJ IDEA -> New Project -> User Defined -> Czechitas Java Console App.


### Maven repository

Pozor, priklady pouzivaji Maven. Poprve spusteny Maven ma tendenci stahnout polovinu internetu. Doporucuji s priklady zaroven studentkam nahrat celou vasi slozku repository (ktera je prednastavena do `C:\Java-Training\Libraries`), aby nemusely uz nic stahovat z internetu.


### Spravne otevirani projektu v IntelliJ IDEA

**POZOR** pri otevirani projektu v IntelliJ IDEA! V oteviracim dialogu IntelliJ IDEA se vybira cela slozka s projektem. Slozka s projektem je takova slozka, ktera obsahuje podslozku ".idea" a pripadne "src". Kdyz clovek otevre spravnou projektovou slozku, ma nahore behovou konfiguraci a zelenou sipku Run. Pokud ale clovek vybere omylem jinou slozku, ktera neni projektova (tzn. neobsahuje ".idea"), IDEA se uplne stupidne prepne do rezimu importu a naimportuje existujici slozku jako novy projekt (a vytvori si novou podslozku ".idea"). Dopadne to tak, ze vsechny tridy jsou cervene, nefunguje code completion, nejsou nastavene zadne knihovny a appka nejde spustit. Nejlepsi reseni je takovy paskvil projektu proste zavrit, smazat nechtene vytvorenou podslozku `.idea` a otevrit jeste jednou spravnou projektovou slozku.
Studentkam je dobre nekolikrat zopakovat a ukazat, ze v oteviracim dialogu se naviguje pomoci zobacku pred nazvy slozek a **nikdy** nepouzivat dvojklik. Dale jde ukazat, ze se projektova slozka pozna podle pritomnosti `src` (na Linuxu a Macu totiz `.idea` neni videt, protoze soubory zacinajici teckou jsou skryte) a dat pozor, aby si to vzdycky otevrely spravne.
