int suma

(0..999).each { number ->
  if (number % 3 == 0 || number % 5 == 0) {
    suma += number
  }
}

println suma
