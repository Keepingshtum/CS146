class Week8:

    # 1. Convert an adjacency list to an adjacency matrix
    def convert_list_to_matrix(self, adj_list, n):
        adj_matrix = [[0] * n for _ in range(n)]
        for i, nodes in enumerate(adj_list):
            for j in nodes:
                adj_matrix[i][j] = 1
        return adj_matrix

    # 2. Convert an adjacency matrix to an adjacency list
    def convert_matrix_to_list(self, adj_matrix):
        adj_list = []
        for i, row in enumerate(adj_matrix):
            adj_list.append([j for j, val in enumerate(row) if val == 1])
        return adj_list

    # 3. Reverse the direction of each edge in a directed graph
    def reverse_graph(self, adj_list):
        reverse_adj_list = [[] for _ in range(len(adj_list))]
        for i, nodes in enumerate(adj_list):
            for j in nodes:
                reverse_adj_list[j].append(i)
        return reverse_adj_list
