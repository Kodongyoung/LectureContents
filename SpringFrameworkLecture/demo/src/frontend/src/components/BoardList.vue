<template>
  <div>
    <h3>게시판 보기</h3>
    <table border="1">
      <tr>
        <th align="center" width="80">번호</th>
        <th align="center" width="320">제목</th>
        <th align="center" width="100">글쓴이</th>
        <th align="center" width="180">등록일자</th>
      </tr>

      <tr v-if="!boards || (Array.isArray(boards) && boards.length === 0)">
        <td colspan="4">
          목록이 비었습니다.
        </td>
      </tr>

      <tr v-else v-for="board in boards" :key="board.boardNo">
        <td align="center">{{ board.boardNo }}</td>
        <td align="left">
          <router-link :to="{ name: 'BoardReadPage',
                        params: { boardNo: board.boardNo.toString() } }">
            {{ board.title }}
          </router-link>
        </td>
        <td align="right">{{ board.writer }}</td>
        <td align="center">{{ board.regDate }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
import {mapActions} from "vuex";

export default {
  name: "BoardList",
  props: {
    boards: {
      type: Array
    }
  },
  methods: {
    ...mapActions(['fetchBoardList'])
  },
  beforeCreate: function () {
    console.log("BoardList Before Create: ")
  },
  created: function () {
    console.log("BoardList Created: ")
  },
  beforeMount: function () {
    console.log("BoardList Before Mount: ")
  },
  mounted: function () {
    console.log("BoardList Mounted: " + this.boards)
  },
  beforeUpdate: function() {
    console.log("BoardList Before Update: ")
  },
  updated: function () {
    console.log("BoardList Updated: ")
  },
  beforeDestroy: function () {
    console.log("BoardList Before Destroy: ")
  },
  destroyed: function () {
    console.log("BoardList Destroyed: ")
  }
}
</script>

<style scoped>

</style>