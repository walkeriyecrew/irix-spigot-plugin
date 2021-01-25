package com.eek.irix.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class irixEvents implements Listener {
    private Player player;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        this.player = event.getPlayer();
        this.player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome to the Server :)");
    }

    @EventHandler
    public void onPlayerWalk(PlayerMoveEvent event){
        this.player = event.getPlayer();
        Block blockUnderFeet = event.getFrom().getBlock();
        Location downLoc = blockUnderFeet.getRelative(BlockFace.DOWN, 1).getLocation();
        Location upLoc = blockUnderFeet.getRelative(BlockFace.UP, 1).getLocation();

        Block upBlock = this.player.getWorld().getBlockAt(
                upLoc.getBlockX(),
                upLoc.getBlockY(),
                upLoc.getBlockZ());

        Block downBlock = this.player.getWorld().getBlockAt(
                downLoc.getBlockX(),
                downLoc.getBlockY(),
                downLoc.getBlockZ());

        Location upNorthWestLoc = upBlock.getRelative(BlockFace.NORTH_WEST, 1).getLocation();
        Location upNorthEastLoc = upBlock.getRelative(BlockFace.NORTH_EAST, 1).getLocation();
        Location upSouthWestLoc = upBlock.getRelative(BlockFace.SOUTH_WEST, 1).getLocation();
        Location upSouthEastLoc = upBlock.getRelative(BlockFace.SOUTH_EAST, 1).getLocation();

        Block upBlockNorthWest = this.player.getWorld().getBlockAt(
                upNorthWestLoc.getBlockX(),
                upNorthWestLoc.getBlockY(),
                upNorthWestLoc.getBlockZ());

        Block upBlockNorthEast = this.player.getWorld().getBlockAt(
                upNorthEastLoc.getBlockX(),
                upNorthEastLoc.getBlockY(),
                upNorthEastLoc.getBlockZ());

        Block upBlockSouthWest = this.player.getWorld().getBlockAt(
                upSouthWestLoc.getBlockX(),
                upSouthWestLoc.getBlockY(),
                upSouthWestLoc.getBlockZ());

        Block upBlockSouthEast = this.player.getWorld().getBlockAt(
                upSouthEastLoc.getBlockX(),
                upSouthEastLoc.getBlockY(),
                upSouthEastLoc.getBlockZ());

        Location downNorthWestLoc = downBlock.getRelative(BlockFace.NORTH_WEST, 1).getLocation();
        Location downNorthEastLoc = downBlock.getRelative(BlockFace.NORTH_EAST, 1).getLocation();
        Location downSouthWestLoc = downBlock.getRelative(BlockFace.SOUTH_WEST, 1).getLocation();
        Location downSouthEastLoc = downBlock.getRelative(BlockFace.SOUTH_EAST, 1).getLocation();

        Block downBlockNorthWest = this.player.getWorld().getBlockAt(
                downNorthWestLoc.getBlockX(),
                downNorthWestLoc.getBlockY(),
                downNorthWestLoc.getBlockZ());

        Block downBlockNorthEast = this.player.getWorld().getBlockAt(
                downNorthEastLoc.getBlockX(),
                downNorthEastLoc.getBlockY(),
                downNorthEastLoc.getBlockZ());

        Block downBlockSouthWest = this.player.getWorld().getBlockAt(
                downSouthWestLoc.getBlockX(),
                downSouthWestLoc.getBlockY(),
                downSouthWestLoc.getBlockZ());

        Block downBlockSouthEast = this.player.getWorld().getBlockAt(
                downSouthEastLoc.getBlockX(),
                downSouthEastLoc.getBlockY(),
                downSouthEastLoc.getBlockZ());
        
        upBlock.getRelative(BlockFace.WEST, 2).setType(Material.AIR);
        upBlock.getRelative(BlockFace.NORTH_WEST, 2).setType(Material.AIR);
        upBlock.getRelative(BlockFace.NORTH, 2).setType(Material.AIR);
        upBlock.getRelative(BlockFace.NORTH_EAST, 2).setType(Material.AIR);
        upBlock.getRelative(BlockFace.EAST, 2).setType(Material.AIR);
        upBlock.getRelative(BlockFace.SOUTH_EAST, 2).setType(Material.AIR);
        upBlock.getRelative(BlockFace.SOUTH, 2).setType(Material.AIR);
        upBlock.getRelative(BlockFace.SOUTH_WEST, 2).setType(Material.AIR);
        upBlockNorthWest.getRelative(BlockFace.NORTH, 1).setType(Material.AIR);
        upBlockNorthWest.getRelative(BlockFace.WEST, 1).setType(Material.AIR);
        upBlockNorthEast.getRelative(BlockFace.NORTH, 1).setType(Material.AIR);
        upBlockNorthEast.getRelative(BlockFace.EAST, 1).setType(Material.AIR);
        upBlockSouthEast.getRelative(BlockFace.SOUTH, 1).setType(Material.AIR);
        upBlockSouthEast.getRelative(BlockFace.EAST, 1).setType(Material.AIR);
        upBlockSouthWest.getRelative(BlockFace.SOUTH, 1).setType(Material.AIR);
        upBlockSouthWest.getRelative(BlockFace.WEST, 1).setType(Material.AIR);

        blockUnderFeet.getRelative(BlockFace.DOWN, 2).setType(Material.AIR);
        downBlock.getRelative(BlockFace.WEST, 2).setType(Material.AIR);
        downBlock.getRelative(BlockFace.NORTH_WEST, 2).setType(Material.AIR);
        downBlock.getRelative(BlockFace.NORTH, 2).setType(Material.AIR);
        downBlock.getRelative(BlockFace.NORTH_EAST, 2).setType(Material.AIR);
        downBlock.getRelative(BlockFace.EAST, 2).setType(Material.AIR);
        downBlock.getRelative(BlockFace.SOUTH_EAST, 2).setType(Material.AIR);
        downBlock.getRelative(BlockFace.SOUTH, 2).setType(Material.AIR);
        downBlock.getRelative(BlockFace.SOUTH_WEST, 2).setType(Material.AIR);
        downBlockNorthWest.getRelative(BlockFace.NORTH, 1).setType(Material.AIR);
        downBlockNorthWest.getRelative(BlockFace.WEST, 1).setType(Material.AIR);
        downBlockNorthEast.getRelative(BlockFace.NORTH, 1).setType(Material.AIR);
        downBlockNorthEast.getRelative(BlockFace.EAST, 1).setType(Material.AIR);
        downBlockSouthEast.getRelative(BlockFace.SOUTH, 1).setType(Material.AIR);
        downBlockSouthEast.getRelative(BlockFace.EAST, 1).setType(Material.AIR);
        downBlockSouthWest.getRelative(BlockFace.SOUTH, 1).setType(Material.AIR);
        downBlockSouthWest.getRelative(BlockFace.WEST, 1).setType(Material.AIR);

        blockUnderFeet.getRelative(BlockFace.DOWN, 1).setType(Material.BLUE_STAINED_GLASS);
        downBlock.getRelative(BlockFace.WEST, 1).setType(Material.BLUE_STAINED_GLASS);
        downBlock.getRelative(BlockFace.NORTH_WEST, 1).setType(Material.BLUE_STAINED_GLASS);
        downBlock.getRelative(BlockFace.NORTH, 1).setType(Material.BLUE_STAINED_GLASS);
        downBlock.getRelative(BlockFace.NORTH_EAST, 1).setType(Material.BLUE_STAINED_GLASS);
        downBlock.getRelative(BlockFace.EAST, 1).setType(Material.BLUE_STAINED_GLASS);
        downBlock.getRelative(BlockFace.SOUTH_EAST, 1).setType(Material.BLUE_STAINED_GLASS);
        downBlock.getRelative(BlockFace.SOUTH, 1).setType(Material.BLUE_STAINED_GLASS);
        downBlock.getRelative(BlockFace.SOUTH_WEST, 1).setType(Material.BLUE_STAINED_GLASS);
    }
}
