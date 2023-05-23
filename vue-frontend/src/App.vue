<template>
  <div>
    <h1>HOLA</h1>

    <form @submit.prevent="createCars">
      <label for="numero">Cantidad de Autos:</label>
      <input type="number" id="numero" min="0" required v-model="cantidadAutos">
      <button type="submit">Enviar</button>
    </form>


    <form @submit.prevent="filterprecioMenor">
      <label for="number">Filtro Menor:</label>
      <input type="number" id="number" min="0" required v-model="preciofiltroMenor">
      <button type="submit">Enviar</button>
    </form>

    <form @submit.prevent="filterprecioMayor">
      <label for="numbermayor">Filtro Mayor:</label>
      <input type="number" id="numbermayor" min="0" required v-model="preciofiltroMayor">
      <button type="submit">Enviar</button>
    </form>
  </div>
  <button @click="mostrarListaCompleta">Reiniciar Filtro</button>


  <div class="modal fade" id="popupbodega">
    <div class="modal-dialog modal-xl modal-dialog-centered">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title">Detalles del auto seleccionado</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <div v-if="selectedCar">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Id</th>
                  <th>Marca</th>
                  <th>Año</th>
                  <th>Tipo</th>
                  <th>Color</th>
                  <th>Precio</th>
                  <th>Turbo</th>
                  <th>Motor</th>
                  <th>Cabinas</th>
                  <th>SunRoof</th>
                  <th>Popularidad</th>
                </tr>
              </thead>
              <tbody>
                <td>{{ selectedCar.id }}</td>
                <td>{{ selectedCar.marca }}</td>
                <td>{{ selectedCar.año }}</td>
                <td>{{ selectedCar.tipo }}</td>
                <td>{{ selectedCar.color }}</td>
                <td>${{ selectedCar.precio }}</td>
                <td>{{ selectedCar.turbo }}</td>
                <td>{{ selectedCar.motor }}</td>
                <td>{{ selectedCar.cabinas }}</td>
                <td>{{ selectedCar.sunroof }}</td>
                <td>{{ selectedCar.popularidad }}</td>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div>
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Id</th>
          <th>Marca</th>
          <th>Año</th>
          <th>Tipo</th>
          <th>Color</th>
          <th>Precio</th>
          <th>Popularidad</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(car, index) in cars" :key="index" @click="selectCar(car)" data-bs-toggle="modal"
          data-bs-target="#popupbodega">
          <td>{{ car.id }}</td>
          <td>{{ car.marca }}</td>
          <td>{{ car.año }}</td>
          <td>{{ car.tipo }}</td>
          <td>{{ car.color }}</td>
          <td>${{ car.precio }}</td>
          <td>{{ car.popularidad }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'App',
  data() {
    return {
      cars: [],
      cantidadAutos: 0,
      preciofiltroMenor: 0,
      preciofiltroMayor: 0,
      selectedCar: null
    };
  },
  methods: {
    createCars() {
      axios
        .get("http://localhost:8080/generar?cantidad=" + this.cantidadAutos)
        .then((response) => {
          this.cars = response.data;
          this.selectedCar = null;

        })
        .catch((error) => {
          console.log(error);
        });
    },
    filterprecioMenor() {
      axios.get("http://localhost:8080/filtroMenor?precio=" + this.preciofiltroMenor).then((response) => {
        this.cars = response.data;
      })
        .catch((error) => {
          console.log(error);
        });
    },
    filterprecioMayor() {
      axios.get("http://localhost:8080/filtroMayor?precio=" + this.preciofiltroMayor).then((response) => {
        this.cars = response.data;
      })
        .catch((error) => {
          console.log(error);
        });
    },
    mostrarListaCompleta() {
      axios.get("http://localhost:8080/autos").then((response) => {
        this.cars = response.data;
      })
    },
    selectCar(car) {
      this.selectedCar = car;
    }
  },


};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
