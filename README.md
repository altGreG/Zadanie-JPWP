# Zadanie-JPWP

### Zadanie 1 (3 pkt., podpunkt 0,5 pkt.)


W tym zadaniu dodasz do wcześniej zdefiniowange template’u z MapView mapę i zaznaczysz na niej pinezki w miejscu budynków A0, B9 i D6 znajdujących się na naszym kampusie w Krakowie, a następnie połączysz je między sobą liniami.

  

a. Szukamy współrzędne A0, B9 i D6 na https://www.latlong.net/.

  

b. Znajdujemy w templatce MainActivity id pod jakim jest zapisane nasze MapView i przypisujemy do zmiennej twojeMapView, typu MapView (użyj funkcji findViewById()).

  

c. Spójrz do dokumentacji i zainicjalizuj mapę w twojeMapView. (w naszym wypadku zmienna typu GoogleMaps nazywa się po prostu map)

  

https://developers.google.com/maps/documentation/android-sdk/map?hl=pl#:~:text=mapFragment.getMapAsync(this)

  

d. Teraz, gdy masz już mapę zacznij dodawać markery. Spójrz tutaj:

  

https://developers.google.com/maps/documentation/android-sdk/marker?hl=pl#add_a_marker

  

(Pamiętaj, by nowe elementy na mapie dodawać w ciele metody onMapReady(), jest to funkcja, która wykonuje się od razu po zainicjalizowaniu się mapy. Na końcu tejże metody jest użyta na mapie funkcja animateCamera, używam ją do tego, by przybliżyć widok mapy na środek kampusu AGH, normalnie bez tego na ekranie byłaby pokazywana z oddalenia cała mapa świata.)

  
  

e. Zaraz przejdziemy do dodawania linii, jednak by wcześniej to zrobić, musisz stworzyć listę współrzędnych, które podasz jako jeden z argumentow w następnym kroku. Stwórz edytowalną listę obiektów typu LatLng i przypisz do niej obiekty z współrzędnymi A0, B9, D6 i znowu A0. Listę nazwij lines.

  

https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/#kotlin.collections.List

  

f. Teraz dodaj linie. Możesz dodać te dwie opcje:\

.color(R.color.white)\

.width(2.0F)\

.addAll(lines)\

do PolylineOptions() by zmienić kolor, szerokość linii oraz dodać wszystkie linie z listy lines na mape.

  

https://developers.google.com/maps/documentation/android-sdk/polygon-tutorial?hl=pl#add_a_polyline_to_draw_a_line_on_the_map , w dokumentacji zamiast przy pomocy listy każda współrzędna jest dodawana osobna, też możesz tak zrobić.

  
  

Gotowe, zrób screen powstałego trójkąta z trzema, znacznikami na tle kampusu i wyślij na upel.
